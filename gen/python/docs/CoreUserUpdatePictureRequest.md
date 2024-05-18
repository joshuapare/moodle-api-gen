# CoreUserUpdatePictureRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delete** | **bool** | If we should delete the user picture | [optional] [default to False]
**draftitemid** | **int** | Id of the user draft file to use as image | [default to null]
**userid** | **int** | Id of the user, 0 for current user | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_user_update_picture_request import CoreUserUpdatePictureRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreUserUpdatePictureRequest from a JSON string
core_user_update_picture_request_instance = CoreUserUpdatePictureRequest.from_json(json)
# print the JSON string representation of the object
print(CoreUserUpdatePictureRequest.to_json())

# convert the object into a dict
core_user_update_picture_request_dict = core_user_update_picture_request_instance.to_dict()
# create an instance of CoreUserUpdatePictureRequest from a dict
core_user_update_picture_request_from_dict = CoreUserUpdatePictureRequest.from_dict(core_user_update_picture_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


