(ns clj-tutorial.lt-cljs-tutorial
  (:require [clojure.string :as string]))



(string/blank? "")

(comment
  (string/upper-case "This is only a test..."))



(def x 1)

clj-tutorial.lt-cljs-tutorial/x

(let [x 2]
  x)

(let [x 2]
  clj-tutorial.lt-cljs-tutorial/x)



(def y (fn [] 1))
(defn y [] 1)

(y)

(def a-bookean true)

(def a-regexp #"\d{3}-?\d{3}-?\d{4}")


;;;;;;;;;;;;;js array;;;;;;;;;;;;;;;;

(def an-array (array 1 2 3))

(into-array (range 3))

(def another-array #js [1 2 3])

;;;;;;;;;;;js object;;;;;;;;;;;;;;

(def an-object (js-obj "foo" "bar"))

(def another-object #js {"foo" "bar" "guad" "da"})

;; This is a mutable JavaScript object with an immutable ClojureScript vector
;; inside.

(def shallow #js {"foo" [1 2 3]})

(js/Date.)

(js/Date. 2012 2 2)

(def another-date #inst "2014-01-15")

;(def another-date #inst "2014-1-15")

(def another-date #inst "2014-01-15")


(def another-regexp (js/RegExp. "\\d{3}-?\\d{3}-?\\d{4}"))

;; NOTE: js/Foo is how you refer to global JavaScript entities of any kind.

js/Date

js/RegExp.

js/requestAnimationFrame(uu)


(type #uuid"f81d4fae-7dec-11d0-a765-00a0c91e6bf6")


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;data types;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def a-vector [1 2 3 4])

;constant time count

(count a-vector)

;add element to the end

(def b-vector (conj a-vector 5))

a-vector

b-vector

(nth a-vector 1)

(a-vector 3)

(get a-vector 3)

(get a-vector 100 :buyaolian)


(def a {:a "a" :b "b"})

(def b {"a" "a" "b" "b"})

(:a a);is good

;The following is wrong!
;("a" a)

(get a :bar :not-found)








