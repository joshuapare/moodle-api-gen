# CoreAuthIsMinorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **int** | Age | [default to null]
**country** | **str** | Country of residence | [default to 'null']

## Example

```python
from openapi_client.models.core_auth_is_minor_request import CoreAuthIsMinorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreAuthIsMinorRequest from a JSON string
core_auth_is_minor_request_instance = CoreAuthIsMinorRequest.from_json(json)
# print the JSON string representation of the object
print(CoreAuthIsMinorRequest.to_json())

# convert the object into a dict
core_auth_is_minor_request_dict = core_auth_is_minor_request_instance.to_dict()
# create an instance of CoreAuthIsMinorRequest from a dict
core_auth_is_minor_request_from_dict = CoreAuthIsMinorRequest.from_dict(core_auth_is_minor_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


