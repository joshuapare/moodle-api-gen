# ModBigbluebuttonbnGetRecordings200ResponseTabledata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity** | **str** |  | 
**columns** | [**List[ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner]**](ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner.md) |  | 
**data** | **str** |  | 
**locale** | **str** |  | 
**ping_interval** | **int** |  | 
**profile_features** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_bigbluebuttonbn_get_recordings200_response_tabledata import ModBigbluebuttonbnGetRecordings200ResponseTabledata

# TODO update the JSON string below
json = "{}"
# create an instance of ModBigbluebuttonbnGetRecordings200ResponseTabledata from a JSON string
mod_bigbluebuttonbn_get_recordings200_response_tabledata_instance = ModBigbluebuttonbnGetRecordings200ResponseTabledata.from_json(json)
# print the JSON string representation of the object
print(ModBigbluebuttonbnGetRecordings200ResponseTabledata.to_json())

# convert the object into a dict
mod_bigbluebuttonbn_get_recordings200_response_tabledata_dict = mod_bigbluebuttonbn_get_recordings200_response_tabledata_instance.to_dict()
# create an instance of ModBigbluebuttonbnGetRecordings200ResponseTabledata from a dict
mod_bigbluebuttonbn_get_recordings200_response_tabledata_from_dict = ModBigbluebuttonbnGetRecordings200ResponseTabledata.from_dict(mod_bigbluebuttonbn_get_recordings200_response_tabledata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


