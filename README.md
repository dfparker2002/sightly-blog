# [sightly](https://github.com/Adobe-Marketing-Cloud/sightly-spec)-blog

Example project for how to setup a proper architecture for [Apache Sling](https://sling.apache.org/) projects. Including a content and a bundle project.

## Dependencies
- Apache Sling Eclipse Plugin

## Getting started
1. Setup the server as described here: [youtube link](https://www.youtube.com/watch?v=_E-AVifg8dc) (Great video in general)
2. Export both the bundle and the content project to the server.
3. Check under [JCR - Explorer](http://localhost:8080/.explorer.html) to see if the bundle_blog bundle is active
4. Enjoy the diverse functionalities this blog has to offer under [blog](http://localhost:8080/blog_entries.html)

#DFP
##CONTENT
Export content_blog to server

- PROB @ content_blog/jcr_root/apps/components/blog_entries/html.html
with <div class="list-group" data-sly-list.blog_entry="${resource.listChildren}">

##BUNDLE
mvn clean install -PautoInstallBundle
