# ModBookGetBooksByCourses200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**books** | [**List[ModBookGetBooksByCourses200ResponseBooksInner]**](ModBookGetBooksByCourses200ResponseBooksInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_book_get_books_by_courses200_response import ModBookGetBooksByCourses200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModBookGetBooksByCourses200Response from a JSON string
mod_book_get_books_by_courses200_response_instance = ModBookGetBooksByCourses200Response.from_json(json)
# print the JSON string representation of the object
print(ModBookGetBooksByCourses200Response.to_json())

# convert the object into a dict
mod_book_get_books_by_courses200_response_dict = mod_book_get_books_by_courses200_response_instance.to_dict()
# create an instance of ModBookGetBooksByCourses200Response from a dict
mod_book_get_books_by_courses200_response_from_dict = ModBookGetBooksByCourses200Response.from_dict(mod_book_get_books_by_courses200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


