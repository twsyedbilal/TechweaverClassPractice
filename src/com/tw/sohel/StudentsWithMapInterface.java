package com.tw.sohel;

public class StudentsWithMapInterface {
		Long id;
		String name;
		String role;
		
		StudentsWithMapInterface(Long id,String name,String role){
			super();
			this.id=id;
			this.name=name;
			this.role=role;
		}

		@Override
		public String toString() {
			return "StudentsWithMapInterface [id=" + id + ", name=" + name + ", role=" + role + "]";
		}
		
}
