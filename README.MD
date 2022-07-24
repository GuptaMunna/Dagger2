Why DI
1- Testiblity
2. Code is extensible
3. Single responsibility
4. Reuseability


dagger2 - Framework to support DI in Android
1. Fully static compile - time dependency framework
2. Annotation based
3. System to create required object


Concept
 - Consumer (@Inject)
 - Producer (@Provides, @Module, @Binds)
 - Connector (@Component)


 Flow

 Consumer -->> Component --->  object via Constructor
                         |-----> Object via module