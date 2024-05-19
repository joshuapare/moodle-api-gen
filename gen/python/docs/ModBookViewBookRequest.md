# ModBookViewBookRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookid** | **int** | book instance id | [default to null]
**chapterid** | **int** | chapter id | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_book_view_book_request import ModBookViewBookRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModBookViewBookRequest from a JSON string
mod_book_view_book_request_instance = ModBookViewBookRequest.from_json(json)
# print the JSON string representation of the object
print(ModBookViewBookRequest.to_json())

# convert the object into a dict
mod_book_view_book_request_dict = mod_book_view_book_request_instance.to_dict()
# create an instance of ModBookViewBookRequest from a dict
mod_book_view_book_request_from_dict = ModBookViewBookRequest.from_dict(mod_book_view_book_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


