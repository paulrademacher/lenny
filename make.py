#!/usr/bin/env python
# -*- coding: utf-8

import os
from string import Template

import lennys

template = Template(open("java-template.tmpl").read())

java_path = "src/main/java/lenny"

methods = []

for item in lennys.lennys:
    face = item['face']
    name = item['name']
    has_arms = item['arms']

    camel = name[0].upper() + name[1:].lower()

    java_src = template.substitute(CAMEL=camel, LENNY=face).replace("\\", "\\\\");
    file_path = os.path.join(java_path, "%s.java") % camel
    print "Writing", file_path
    output = open(file_path, "w").write(java_src)

    spacer = ' ' * (7 - len(camel))
    methods.append("%s.println(); %s//  %s" % (camel, spacer, face))

    if not has_arms:
        methods.append("%s.yay();     %s//  \\%s/" % (camel, spacer, face))
        methods.append("%s.flex();    %s//  ᕦ%sᕤ" % (camel, spacer, face))
        methods.append("%s.shrug();   %s//  ¯\_%s_/¯" % (camel, spacer, face))

    methods.append("")

print "Writing README.md"
README_INPUT = "README.tmpl"
README_OUTPUT = "README.md"
readme_template = Template(open(README_INPUT).read())
methods_string = "\n".join(methods)
open(README_OUTPUT, "w").write(readme_template.substitute(METHODS=methods_string))

