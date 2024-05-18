# ToolDataprivacyGetDataRequest200ResponseResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowfiltering** | **bool** | allowfiltering | [optional] [default to False]
**approvedeny** | **bool** | approvedeny | [optional] [default to False]
**canmarkcomplete** | **bool** | canmarkcomplete | [optional] [default to False]
**canreview** | **bool** | canreview | [optional] [default to False]
**comments** | **str** | comments | [default to '']
**commentsformat** | **int** | commentsformat | [default to 2]
**creationmethod** | **int** | creationmethod | [default to 0]
**dpo** | **int** | dpo | [default to 0]
**dpocomment** | **str** | dpocomment | [default to '']
**dpocommentformat** | **int** | dpocommentformat | [default to 2]
**dpouser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**foruser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | 
**id** | **int** | id | [default to 0]
**messagehtml** | **str** | messagehtml | [optional] [default to 'null']
**requestedby** | **int** | requestedby | [default to 0]
**requestedbyuser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**status** | **int** | status | [default to 2]
**statuslabel** | **str** | statuslabel | [default to 'null']
**statuslabelclass** | **str** | statuslabelclass | [default to 'null']
**systemapproved** | **bool** | systemapproved | [default to False]
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**type** | **int** | type | 
**typename** | **str** | typename | [default to 'null']
**typenameshort** | **str** | typenameshort | [default to 'null']
**userid** | **int** | userid | [default to {}]
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.tool_dataprivacy_get_data_request200_response_result import ToolDataprivacyGetDataRequest200ResponseResult

# TODO update the JSON string below
json = "{}"
# create an instance of ToolDataprivacyGetDataRequest200ResponseResult from a JSON string
tool_dataprivacy_get_data_request200_response_result_instance = ToolDataprivacyGetDataRequest200ResponseResult.from_json(json)
# print the JSON string representation of the object
print(ToolDataprivacyGetDataRequest200ResponseResult.to_json())

# convert the object into a dict
tool_dataprivacy_get_data_request200_response_result_dict = tool_dataprivacy_get_data_request200_response_result_instance.to_dict()
# create an instance of ToolDataprivacyGetDataRequest200ResponseResult from a dict
tool_dataprivacy_get_data_request200_response_result_from_dict = ToolDataprivacyGetDataRequest200ResponseResult.from_dict(tool_dataprivacy_get_data_request200_response_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


