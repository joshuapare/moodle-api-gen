# ModBookGetBooksByCourses200ResponseBooksInner

Books

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**customtitles** | **int** | Book custom titles type | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**navstyle** | **int** | Book navigation style configuration | [optional] [default to null]
**numbering** | **int** | Book numbering configuration | [optional] [default to null]
**revision** | **int** | Book revision | [optional] [default to null]
**section** | **int** | Course section id | [optional] 
**timecreated** | **int** | Time of creation | [optional] [default to null]
**timemodified** | **int** | Time of last modification | [optional] [default to null]
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_book_get_books_by_courses200_response_books_inner import ModBookGetBooksByCourses200ResponseBooksInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModBookGetBooksByCourses200ResponseBooksInner from a JSON string
mod_book_get_books_by_courses200_response_books_inner_instance = ModBookGetBooksByCourses200ResponseBooksInner.from_json(json)
# print the JSON string representation of the object
print(ModBookGetBooksByCourses200ResponseBooksInner.to_json())

# convert the object into a dict
mod_book_get_books_by_courses200_response_books_inner_dict = mod_book_get_books_by_courses200_response_books_inner_instance.to_dict()
# create an instance of ModBookGetBooksByCourses200ResponseBooksInner from a dict
mod_book_get_books_by_courses200_response_books_inner_from_dict = ModBookGetBooksByCourses200ResponseBooksInner.from_dict(mod_book_get_books_by_courses200_response_books_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


