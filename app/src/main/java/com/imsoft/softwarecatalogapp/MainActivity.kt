package com.imsoft.softwarecatalogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.imsoft.softwarecatalogapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SoftClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(softList, mainActivity)
        }
    }

    override fun onClick(softTech: SoftTech) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(SOFT_ID_EXTRA, softTech.id)
        startActivity(intent)
    }

    private fun populateBooks() {

        val kotlin = SoftTech(
            R.drawable.kotlin,
            "JetBrains ",
            "KOTLIN",
            "Kotlin programming language was developed by a software development company called JetBrains. It was first introduced in 2011 and officially released in 2017. Kotlin is a language compatible with Java and has become a popular choice for Android application development. Kotlin aims to overcome some of Java's shortcomings and provide a more modern programming experience. Kotlin's official website is located at https://kotlinlang.org/"
        )
        softList.add(kotlin)

        val swift = SoftTech(
            R.drawable.swift,
            "Chris Lattner | APPLE ",
            "SWIFT",
            "The Swift programming language was developed by Apple Inc. First introduced in 2014, it is designed for use on Apple's various platforms such as macOS, iOS, watchOS and tvOS. Swift is designed to replace Objective-C as a more modern, secure and performant programming language. Chris Lattner is known as the lead designer and developer of Swift and led the development of the language."
        )
        softList.add(swift)

        val react = SoftTech(
            R.drawable.react,
            "Jordan Walke | FACEBOOK ",
            "REACT",
            "React is a JavaScript language developed by Jordan Walke. React was first used by Facebook in 2011 and then became one of Facebook's open source projects in 2013. Jordan Walke developed React for use in projects at Facebook, and it has since become an open source project supported by Facebook and a large community."
        )
        softList.add(react)

        val angular = SoftTech(
            R.drawable.angular,
            "Misko Hevery | GOOGLE",
            "ANGULAR",
            "Angular is a JavaScript framework developed by Google. It was first developed by Misko Hevery in 2010. This framework, which started as AngularJS, was later called Angular 2 and then just \"Angular\". Angular is a web framework for developing single page applications (SPA) and largely uses the TypeScript programming language. TypeScript is an open source programming language developed by Microsoft and provides a feature that adds type safety to JavaScript."
            )
        softList.add(angular)

        val net = SoftTech(
            R.drawable.net,
            "Microsoft  ",
            ".NET",
            "The .NET Framework was developed by Microsoft. It was first released in 2000 and has been continuously updated since then. The .NET Framework is a software framework developed for Microsoft's Windows operating system platform and is used to facilitate the development, deployment and running of Windows applications. The .NET Framework supports many different programming languages and provides developers with a large collection of tools and libraries. "
            )
        softList.add(net)

        val javascript = SoftTech(
            R.drawable.javascript,
            " Netscape Communications Corporation ",
            "JAVASCRIPT",
            "JavaScript was started to be developed by Netscape Communications Corporation in 1995. First called \"LiveScript\", the language was later renamed \"JavaScript\". The purpose of the development of JavaScript is to create interactive web pages for web browsers and to provide a programming language that can run on the browser side. Since JavaScript works on the browser side, it has made web pages more dynamic and interactive. Today, JavaScript is one of the most widely used programming languages in web development and is used on the server side (such as Node.js) as well as browsers."
            )
        softList.add(javascript)

        val jquery = SoftTech(
            R.drawable.jquery,
            "John Resig ",
            "JQUERY",
            "jQuery is a JavaScript library developed and maintained by John Resig. jQuery provides web developers with a set of facilities they can use to make their web pages interactive. Its first version was released in 2006 and has since been supported by many developers and communities. jQuery's goal is to make JavaScript code simpler and better cross-browser compatibility. John Resig played an important role in developing jQuery and has led the jQuery community."
            )
        softList.add(jquery)

    }
}