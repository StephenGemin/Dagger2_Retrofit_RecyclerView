# Dagger 2 Dependency Injection with Retrofit/RecyclerView using Kotlin

![Intro Picture](https://github.com/StephenGemin/Dagger2_Retrofit_RecyclerView/blob/master/readmepics/DependencyInjection.jpeg)

## Brief Introduction
If you are like me, I transitioned from another background into software programming. I've found dependency injection (DI) particiularly 
difficult to wrap my head around.  I've gone through at least 10-15 websites explaining this concept, but it was this article that really 
hit it home for me.  I went through and re-wrote the code step by step.  

## Useful Sources
For anyone who reads this, I've re-written the code from this website.
* [Android Dagger 2 + Retrofit + RecyclerView](https://www.journaldev.com/20405/android-dagger-2-retrofit-recyclerview#ui-package)

Before even reading through the code, watch this youtube video from Jake Wharton on Dagger2. It's absolutely jam packed with useful information and I had to watch this a few times. 
* [The Future of Dependency Injection with Dagger 2](https://www.youtube.com/watch?v=plK0zyRLIP8)

## About this Repo
Now I say that it's written in Kotlin, but in truth, there is a mix of Kotlin and Java Files.  I had a lot of trouble injecting the ApplicationContext into the MainActivity and DetailActivity.  The only way I was able to stop the Dagger2 error during compiling was to copy and past the Java code from the website. (see picture below).  
![Inject_Application_Context_mContext](https://github.com/StephenGemin/Dagger2_Retrofit_RecyclerView/blob/master/readmepics/chrome_f0NwSDqseT.png)

## My brief take on DI so far ...
The most essential things to remember when working with Dagger 2 DI
* @Module -- used on the class which will provide dependencies.
  * @Provides -- used on the class methods of the class that has the @Module
* @Inject -- Used to request dependencies
* @Component -- This is where the magic happens.  This is called on an Interface (at least from my reading).  It is where the provided dependencies in @Module/@Provides are put into the places requesting the dependencies @Inject.  Within the @Component annotation you can call keywords like (1) modules, (2) includes, (2) dependencies, etc.
  * modules --  tells Dagger2 which modules are providing the dependencies
  * dependencies -- Use if you are depending on another component 
  * includes -- I don't fully understand this, but I think you use this when one module uses another module, but doesn't depend on it.  Confusing, but I'm not how else to explain it ☺.  There is only one case in the article that uses the includes.
* @Singleton -- think of this as a global scoped item.  Nothing can be above @Singleton scope.  It's used when you are using a class/method throughout your entire app.  
