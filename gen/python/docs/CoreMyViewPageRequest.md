# CoreMyViewPageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | **str** | My page to trigger a view event | [default to 'null']

## Example

```python
from openapi_client.models.core_my_view_page_request import CoreMyViewPageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreMyViewPageRequest from a JSON string
core_my_view_page_request_instance = CoreMyViewPageRequest.from_json(json)
# print the JSON string representation of the object
print(CoreMyViewPageRequest.to_json())

# convert the object into a dict
core_my_view_page_request_dict = core_my_view_page_request_instance.to_dict()
# create an instance of CoreMyViewPageRequest from a dict
core_my_view_page_request_from_dict = CoreMyViewPageRequest.from_dict(core_my_view_page_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


