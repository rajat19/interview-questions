package hello_world

import "fmt"

func helloWorld(s string) {
	fmt.Printf("Hello %s", s)
}

func main()  {
	helloWorld("Golang")
}