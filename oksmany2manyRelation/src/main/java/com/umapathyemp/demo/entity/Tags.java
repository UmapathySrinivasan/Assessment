package com.umapathyemp.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
	public class Tags {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    //private List<Posts> posts=new ArrayList<>();
	   // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "tags")
	   // private Set<Posts> posts= new HashSet<>();
		public Long getId() {
			return id;
		}
		@Override
		public String toString() {
			return "Tags [id=" + id + ", name=" + name + "]";
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Tags(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Tags() {
			super();
			// TODO Auto-generated constructor stub
		}
	}


