# CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aggregation** | **int32** | aggregation method 1 means all, 2 means any | [default to null]
**Completed** | **bool** | true if the course is complete, false otherwise | [default to null]
**Completions** | [**[]CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.md) |  | 

## Methods

### NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus

`func NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus(aggregation int32, completed bool, completions []CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner, ) *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus`

NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus instantiates a new CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusWithDefaults

`func NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusWithDefaults() *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus`

NewCoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusWithDefaults instantiates a new CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregation

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetAggregation() int32`

GetAggregation returns the Aggregation field if non-nil, zero value otherwise.

### GetAggregationOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetAggregationOk() (*int32, bool)`

GetAggregationOk returns a tuple with the Aggregation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregation

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) SetAggregation(v int32)`

SetAggregation sets Aggregation field to given value.


### GetCompleted

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetCompleted() bool`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetCompletedOk() (*bool, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) SetCompleted(v bool)`

SetCompleted sets Completed field to given value.


### GetCompletions

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetCompletions() []CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner`

GetCompletions returns the Completions field if non-nil, zero value otherwise.

### GetCompletionsOk

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) GetCompletionsOk() (*[]CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner, bool)`

GetCompletionsOk returns a tuple with the Completions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletions

`func (o *CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus) SetCompletions(v []CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner)`

SetCompletions sets Completions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


