# CoreTagGetTagindex200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **str** | name of anchor | [optional] [default to 'null']
**component** | **str** | component | 
**content** | **str** | title | [default to 'null']
**exclusivetext** | **str** | text for exclusive link | [optional] [default to 'null']
**exclusiveurl** | **str** | URL for exclusive link | [optional] [default to 'null']
**hascontent** | **int** | whether the content is present | [default to null]
**itemtype** | **str** | itemtype | [default to 'null']
**nextpageurl** | **str** | URL for the next page | [optional] [default to 'null']
**prevpageurl** | **str** | URL for the next page | [optional] 
**ta** | **int** | tag area id | 
**tagid** | **int** | tag id | [default to null]
**title** | **str** | title | 

## Example

```python
from openapi_client.models.core_tag_get_tagindex200_response import CoreTagGetTagindex200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagindex200Response from a JSON string
core_tag_get_tagindex200_response_instance = CoreTagGetTagindex200Response.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagindex200Response.to_json())

# convert the object into a dict
core_tag_get_tagindex200_response_dict = core_tag_get_tagindex200_response_instance.to_dict()
# create an instance of CoreTagGetTagindex200Response from a dict
core_tag_get_tagindex200_response_from_dict = CoreTagGetTagindex200Response.from_dict(core_tag_get_tagindex200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


