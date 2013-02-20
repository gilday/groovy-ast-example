package org.example.test

import org.example.Example
import org.junit.Test

class ExampleTest {

    @Test
    void testItWorks() {
        def greeter = new Example()

        assert greeter.sayHello() == "Hello World!"
    }
}
