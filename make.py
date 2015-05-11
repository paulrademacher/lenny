#!/usr/bin/env python
# -*- coding: utf-8

import os
from string import Template

import lennys

template = Template(open("java-template.tmpl").read())

java_path = "src/main/java"
print "Writing", os.path.join(java_path, "README.md")
readme = open(os.path.join(java_path, "README.md"), "w")

readme.write("# Lenny API\n\n")
readme.write("```\n");
readme.write("import lenny.*\n\n");

for item in lennys.lennys:
    face = item['face']
    name = item['name']
    has_arms = item['arms']

    camel = name[0].upper() + name[1:].lower()

    java_src = template.substitute(CAMEL=camel, LENNY=face).replace("\\", "\\\\");
    file_path = os.path.join(java_path, "%s.java") % camel
    print "Writing", file_path
    output = open(file_path, "w").write(java_src)

    spacer = ' ' * (10 - len(camel))
    readme.write("%s.println(); %s//  %s\n" % (camel, spacer, face))

    if not has_arms:
        readme.write("%s.yay();     %s//  \\%s/\n" % (camel, spacer, face))
        readme.write("%s.flex();    %s//  ᕦ%sᕤ\n" % (camel, spacer, face))
    readme.write("\n")

readme.write("```");

