# CoreTagGetTagAreas200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**areas** | [**List[CoreTagGetTagAreas200ResponseAreasInner]**](CoreTagGetTagAreas200ResponseAreasInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_tag_get_tag_areas200_response import CoreTagGetTagAreas200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagAreas200Response from a JSON string
core_tag_get_tag_areas200_response_instance = CoreTagGetTagAreas200Response.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagAreas200Response.to_json())

# convert the object into a dict
core_tag_get_tag_areas200_response_dict = core_tag_get_tag_areas200_response_instance.to_dict()
# create an instance of CoreTagGetTagAreas200Response from a dict
core_tag_get_tag_areas200_response_from_dict = CoreTagGetTagAreas200Response.from_dict(core_tag_get_tag_areas200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


