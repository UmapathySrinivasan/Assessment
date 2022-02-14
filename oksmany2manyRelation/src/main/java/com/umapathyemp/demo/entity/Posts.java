package com.umapathyemp.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
@Entity
public class Posts {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String title, description;
	 
	    /* @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	    @JoinTable(
	            name = "tags_posts",    				// intermediate physical table name 
	            joinColumns = {
	                    @JoinColumn(name = "posts_id")  // column to connect with posts
	                    },
	            inverseJoinColumns = {
	                    @JoinColumn(name="tags_id")  	 // column to connect with posts
	                    }
	            )
	    private Set<Tags> tags=new HashSet<>();*/
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	/*	public Set<Tags> getTags() {
			return tags;
		}
		public void setTags(Set<Tags> tags) {
			this.tags = tags;
		}*/
		@Override
		public String toString() {
			return "Posts [id=" + id + ", title=" + title + ", description=" + description + ", tags=" +   "]";
		}
		public Posts(Long id, String title, String description, Set<Tags> tags) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			//this.tags = tags;
		}
		public Posts() {
			super();
			// TODO Auto-generated constructor stub
		} 

}
