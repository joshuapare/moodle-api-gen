# EnrolMetaDeleteInstancesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instances** | [**List[EnrolMetaDeleteInstancesRequestInstancesInner]**](EnrolMetaDeleteInstancesRequestInstancesInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.enrol_meta_delete_instances_request import EnrolMetaDeleteInstancesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EnrolMetaDeleteInstancesRequest from a JSON string
enrol_meta_delete_instances_request_instance = EnrolMetaDeleteInstancesRequest.from_json(json)
# print the JSON string representation of the object
print(EnrolMetaDeleteInstancesRequest.to_json())

# convert the object into a dict
enrol_meta_delete_instances_request_dict = enrol_meta_delete_instances_request_instance.to_dict()
# create an instance of EnrolMetaDeleteInstancesRequest from a dict
enrol_meta_delete_instances_request_from_dict = EnrolMetaDeleteInstancesRequest.from_dict(enrol_meta_delete_instances_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


