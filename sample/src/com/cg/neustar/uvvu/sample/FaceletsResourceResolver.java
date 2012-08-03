package com.cg.neustar.uvvu.sample;

import java.net.URL;

import javax.faces.view.facelets.ResourceResolver;

public class FaceletsResourceResolver extends ResourceResolver {

private ResourceResolver parent;
private String basePath;

public FaceletsResourceResolver(ResourceResolver parent) {
this.parent = parent;
this.basePath = "/WEB-INF/resources"; // TODO: Make configureable?

}

@Override
public URL resolveUrl(String path) {


URL url = getClass().getResource(basePath + path); // Resolves from WEB-INF.
System.out.println(basePath);
System.out.println(url);

return url;
}

}

