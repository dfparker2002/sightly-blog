package com.sling_bundle_blog;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class FindPath {
	@Inject @Named("jcr:title")
	String title;
	
	@Inject @Named("jcr:description")
	String description;
	
	public String getTitleAndDescription(){
		return "title: " + title + ",\n description: " + description;
	}
}