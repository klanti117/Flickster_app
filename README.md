# Flickster_app

Android app that leverages the [TMDB API](https://www.themoviedb.org/documentation/api) to search movies and display cover images. 

![Imgur](http://i.imgur.com/NJmF42Yl.png)

## Overview

The app does the following:

1. Fetch the movues from the [TMDB API](https://www.themoviedb.org/documentation/api) in JSON format
2. Deserialize the JSON data for each of the books into `Movie` objects
3. Build an array of `Movie` objects and notify the adapter to display the new data. 
4. Define a view holder so the adapter can render each book model. 

To achieve this, there are four different components in this app:

1. `MovieClient` - Responsible for executing the API requests and retrieving the JSON
2. `Movie` - Model object responsible for encapsulating the attributes for each individual book
3. `MovieAdapter` - Responsible for mapping each `Book` to a particular view layout
4. `MovieListActivity` - Responsible for fetching and deserializing the data and configuring the adapter


## Suggested Extensions
tbd

## Libraries

This app leverages two third-party libraries:

 * [AsyncHttpClient](https://github.com/codepath/AsyncHttpClient) - For asynchronous network requests
 * [Glide](https://github.com/bumptech/glide) - For remote image loading
