(ns twist-of-carts.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(def young-kim-quote
  [:div.section.yk-quote
   [:div.container
    [:div.columns
     [:div.column
      [:div.yk-quote__highlight
       [:div.yk-quote__figure "95%"]
       [:p.yk-quote__text "Clients who remain with Young Kim Accounting Solutions after the first year"]]]
     [:div.column
      [:div.yk-quote__highlight
       [:div.yk-quote__figure "65%"]
       [:p.yk-quote__text "Clients referred via word-of-mouth from other happy clients"]]]
     [:div.column
      [:div.yk-quote__highlight
       [:div.yk-quote__figure "25"]
       [:p.yk-quote__text "Years of international accounting and taxation services provided"]]]]
    [:div
     [:p.yk-quote__quote "&ldquo;My model has always been simple: maintaining long-term relationships with great clients built on trust by consistently providing excellence.&rdquo;"]
     [:div.portrait
      [:img {:src "/images/portrait.jpg"}]
      [:div
       [:p.yk-quote__name "Young Shin Kim, CPA"]
       [:a {:href "/about-young-shin-kim/"} "Learn More About Young &rarr;"]]
      ]
     ]]
   ])

(defn bare-layout
  "Render a page with the shared layout."
  [{title :title, content :content}]
  (html5
   {:lang "en"}
   [:head
    [:meta {:name "viewport" :content "width=device-width"}]
    [:meta {:name "viewport" :content "initial-scale=1.0"}]
    [:title title]
    (include-css "https://fonts.googleapis.com/css?family=Catamaran:200")
    (include-css "https://cdnjs.cloudflare.com/ajax/libs/bulma/0.8.0/css/bulma.min.css")
    (include-css "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css")
    (include-css "/css/main.css")]
   [:body
    [:nav.navbar.ykas-nav
     [:div.navbar-brand
      [:a.navbar-item.logo {:href "/"} "Young Kim Accounting Solutions"]
      [:a.navbar-burger {:role "button"
                         :aria-label "menu"
                         :aria-expanded false
                         :data-target "navMenu"}
       (take 3 (repeat [:span {:aria-hidden true}]))]]
     [:div#navMenu.navbar-menu
      [:div.navbar-start
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "About"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/about/"} "About Young Kim Accounting Solutions"]
         [:a.navbar-item {:href "/about-young-shin-kim/"} "About Young Shin Kim"]]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "Business Services"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/business-tax-return-preparation/"} "Business Tax Return Preparation"]
         [:a.navbar-item {:href "/business-tax-planning/"} "Business Tax Planning"]
         [:a.navbar-item {:href "/international-tax-services/"} "International Tax &amp; Accounting Services"]
         ]]
       [:div.navbar-item.has-dropdown.is-hoverable
        [:span.navbar-link "Personal Services"]
        [:div.navbar-dropdown
         [:a.navbar-item {:href "/personal-tax-return-preparation/"} "Personal Tax Return Preparation"]
         [:a.navbar-item {:href "/personal-tax-planning/"} "Personal Tax Planning"]
         ]]
       [:a.navbar-item {:href "/contact/"}
          "Contact Us"]]
      [:div.navbar-end
       [:span.navbar-item
        [:small "Call: +1 (415) 488-7192"]]
       [:div.navbar-item
        [:a.button.hire-me.ykas-btn {:href "/contact/"}
         [:i.fas.fa-phone]
         "&nbsp;"
         [:i.fas.fa-envelope]
         "&nbsp;&nbsp;&nbsp;Get In Touch"]]]]]
    [:div content]
    [:footer.footer.ykas-footer
     [:div.columns
      [:div.column
       [:span.ykas-footer__nav-list-header "Young Kim Accounting Solutions"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/"}  "Home"]]
        [:li [:a {:href "/about/"} "About Young Kim Accounting Solutions"]]
        [:li [:a {:href "/about-young-shin-kim/"} "About Young Shin Kim"]]
        [:li [:a {:href "/contact/"} "Contact Us"]]]
       ]
      [:div.column
       [:span.ykas-footer__nav-list-header "Business Services"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/business-tax-return-preparation/"} "Business Tax Return Preparation"]]
        [:li [:a {:href "/business-tax-planning/"} "Business Tax Planning"]]
        [:li [:a {:href "/international-tax-services/"} "International Tax &amp; Accounting Services"]]]]
      [:div.column
       [:span.ykas-footer__nav-list-header "Personal Services"]
       [:ul.ykas-footer__nav-list
        [:li [:a {:href "/personal-tax-return-preparation/"} "Personal Tax Return Preparation"]]
        [:li [:a {:href "/personal-tax-planning/"} "Personal Tax Planning"]]]]
      [:div.column]
      [:div.column
       [:p "Young Kim Accounting Solutions"]
       [:p "550 6th Ave"]
       [:p "San Francisco, CA 94118"]
       [:p "&nbsp;"]
       [:p "+1 (415) 488-7192"]
       [:p "&nbsp;"]
       [:small "Copyright &copy; 2020 Young Kim Accounting Solutions. All rights reserved."]
       ]]]
    [:script {:src "/js/main.js"}]
    ]))

(defn wrap-content-with-cta [content]
  [:div
   [:div content]
   [:div.midsection-cta
     [:div "Have a question, comment, or want to learn how Young Kim Accounting Solutions can help you, your business or your family?"]
     [:a.button.hire-me.midsection-cta__btn {:href "/contact/"}
      [:i.fas.fa-phone]
      "&nbsp;"
      [:i.fas.fa-envelope]
      "&nbsp;&nbsp;&nbsp;Get In Touch"]]])

(defn wrap-content-with-testimonial [content]
  [:div
   [:div content]
   [:section.hero
    [:div.testimonial__wrapper.hero-body
     [:div.testimonial.container
      [:h2.testimonial__title "What Are Our Current Clients Saying?"]
      [:div.columns
       [:div.column.is-one-third
        [:div.columns
         [:div.column.is-two-thirds
          [:h3.testimonial__name "Paul S. Chun"]
          [:div "CEO &amp; Founder, Elbower"]
          [:div "Tokyo, Japan"]
          [:div "Business & Personal Client Since 2005"]]
         [:div.column.is-one-third
          [:img.testimonial__portrait {:src "/images/paul-portrait.jpg"}]]
         ]]
       [:div.column.is-two-thirds
        [:p.testimonial__quote "&ldquo;I've never even considered looking elsewhere after I started working with Young Kim Accounting Solutions. Young has helped clarify all of my uncertainties, and she's also informed me of policies in international taxation that I'd otherwise be completely unaware of, which have been huge breaks for me. I'd be lost without her services, plain and simple.&rdquo;"]]
       ]
      ]]]])

(defn wrap-content-with-quote [content]
  [:div
   [:div content]
   young-kim-quote])

(defn page-layout [options]
  (bare-layout (-> options
                   (update :content wrap-content-with-cta)
                   (update :content wrap-content-with-testimonial)
                   (update :content wrap-content-with-quote)
                   )))

(defn testimonial-bottom-layout [options]
  (bare-layout (update options :content wrap-content-with-testimonial)))
