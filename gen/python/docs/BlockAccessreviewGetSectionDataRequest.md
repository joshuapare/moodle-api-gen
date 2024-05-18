# BlockAccessreviewGetSectionDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | The course id to obtain results for. | 

## Example

```python
from openapi_client.models.block_accessreview_get_section_data_request import BlockAccessreviewGetSectionDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BlockAccessreviewGetSectionDataRequest from a JSON string
block_accessreview_get_section_data_request_instance = BlockAccessreviewGetSectionDataRequest.from_json(json)
# print the JSON string representation of the object
print(BlockAccessreviewGetSectionDataRequest.to_json())

# convert the object into a dict
block_accessreview_get_section_data_request_dict = block_accessreview_get_section_data_request_instance.to_dict()
# create an instance of BlockAccessreviewGetSectionDataRequest from a dict
block_accessreview_get_section_data_request_from_dict = BlockAccessreviewGetSectionDataRequest.from_dict(block_accessreview_get_section_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


