# MoodleClient.Model.CoreGradesUpdateGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activityid** | **int** | The activity ID | [default to null]
**Component** | **string** | A component, for example mod_forum or mod_quiz | [default to "null"]
**Courseid** | **int** | id of course | 
**Grades** | [**List&lt;CoreGradesUpdateGradesRequestGradesInner&gt;**](CoreGradesUpdateGradesRequestGradesInner.md) |  | [optional] 
**Itemdetails** | [**CoreGradesUpdateGradesRequestItemdetails**](CoreGradesUpdateGradesRequestItemdetails.md) |  | [optional] 
**Itemnumber** | **int** | grade item ID number for modules that have multiple grades. Typically this is 0. | [default to null]
**Source** | **string** | The source of the grade update | [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

