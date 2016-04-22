package com.sling_bundle_blog;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class FindPath {
	@Inject
	String title;
	
	@Inject 
	String description;
	
	public String getTitleAndDescription(){
		return "title: " + title + ",\n description: " + description;
	}
}