# CoreTagGetTagCloudRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ctx** | **int** | Only retrieve tag instances in this context. | [optional] [default to 0]
**fromctx** | **int** | Context id where this tag cloud is displayed. | [optional] [default to 0]
**isstandard** | **bool** | Whether to return only standard tags. | [optional] [default to False]
**limit** | **int** | Maximum number of tags to retrieve. | [optional] [default to 150]
**rec** | **int** | Retrieve tag instances in the $ctx context and it&#39;s children. | [optional] [default to 1]
**search** | **str** | Search string. | [optional] [default to '']
**sort** | **str** | Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid). | [optional] [default to 'name']
**tagcollid** | **int** | Tag collection id. | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_tag_get_tag_cloud_request import CoreTagGetTagCloudRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreTagGetTagCloudRequest from a JSON string
core_tag_get_tag_cloud_request_instance = CoreTagGetTagCloudRequest.from_json(json)
# print the JSON string representation of the object
print(CoreTagGetTagCloudRequest.to_json())

# convert the object into a dict
core_tag_get_tag_cloud_request_dict = core_tag_get_tag_cloud_request_instance.to_dict()
# create an instance of CoreTagGetTagCloudRequest from a dict
core_tag_get_tag_cloud_request_from_dict = CoreTagGetTagCloudRequest.from_dict(core_tag_get_tag_cloud_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


