package main

import "fmt"

func fib(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	var res int = fib(n-1) + fib(n-2)
	fmt.Printf("%d number : %d \n", n, res)
	return res
}

func main() {
	fmt.Println(fib(7))
}
