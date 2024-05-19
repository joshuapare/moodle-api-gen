# CoreTagGetTags200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List[CoreTagGetTags200ResponseTagsInner]**](CoreTagGetTags200ResponseTagsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_tag_get_tags200_response import CoreTagGetTags200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTags200Response from a JSON string
core_tag_get_tags200_response_instance = CoreTagGetTags200Response.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTags200Response.to_json())

# convert the object into a dict
core_tag_get_tags200_response_dict = core_tag_get_tags200_response_instance.to_dict()
# create an instance of CoreTagGetTags200Response from a dict
core_tag_get_tags200_response_from_dict = CoreTagGetTags200Response.from_dict(core_tag_get_tags200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


