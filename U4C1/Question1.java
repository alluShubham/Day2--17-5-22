//Explain the difference between IS-A and Has-A relationship with the help of an
//example and explain about access modifiers and their accessibility?
//		
//		IS-A relationShip:
//			#It is also known as inheritance.
//			#The main advantage of IS-A is code reusability.
//			#By using extends keyword we can impleament IS-A relaionShip
//			#By defualt all the properties of parent class inherit in child class
//			#parent refrence can be used for to hold child object but child refrence cant be used to hold parent object.
//			
//			e.g.
//			class Car{
//				int noOfWheel;
//				String color;
//			}
//
//			class Sedan extends Car{
//				
//			}
//			
//		HAS-A relationShip:
//			# HAS-A relationship is also known as Compostion and Aggregation.
//			#There is specific keyword for impleamenting HAS-A relation but most time we are depending on the new keyword
//			#Do not use inheritane just to get  code reuse
//			#Do not use innheritance just to get at polymorphism
//			
//			e.g.
//			class engine{
//				void run() {
//					
//				}
//			}
//		class CAR{
//			engine eg =new engine(); 
//		}
//		
//		// Access Modifier
//		# public: public keyword is used as for visibilty among the all other classes. for accessing outside of the class.
//		
//		#default: Default keyword is used as for accessing all the data inside the class and package.
//		
//		#protected: this keyword is act as a public for inside the class and package.
//		
//		#private: This keyword is used for accessing inside the class and for security reason. and does not leak the data.
