(ns mvn-test.core
  (:require [trammel.core :refer [defconstrainedrecord]]))

(defconstrainedrecord A []
  ""
  [])

(assert (= (class (->A))
           (class (A.))))
