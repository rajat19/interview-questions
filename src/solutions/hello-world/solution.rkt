(define/contract (hello-world s)
  (-> string? void?)
    (print "Hello ~v" s)
  )