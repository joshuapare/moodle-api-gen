# ToolLpDataForCompetencySummaryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Competencyid** | **int32** | The competency id | 
**Includecourses** | Pointer to **bool** | Include or not competency courses | [optional] [default to false]
**Includerelated** | Pointer to **bool** | Include or not related competencies | [optional] [default to false]

## Methods

### NewToolLpDataForCompetencySummaryRequest

`func NewToolLpDataForCompetencySummaryRequest(competencyid int32, ) *ToolLpDataForCompetencySummaryRequest`

NewToolLpDataForCompetencySummaryRequest instantiates a new ToolLpDataForCompetencySummaryRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolLpDataForCompetencySummaryRequestWithDefaults

`func NewToolLpDataForCompetencySummaryRequestWithDefaults() *ToolLpDataForCompetencySummaryRequest`

NewToolLpDataForCompetencySummaryRequestWithDefaults instantiates a new ToolLpDataForCompetencySummaryRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompetencyid

`func (o *ToolLpDataForCompetencySummaryRequest) GetCompetencyid() int32`

GetCompetencyid returns the Competencyid field if non-nil, zero value otherwise.

### GetCompetencyidOk

`func (o *ToolLpDataForCompetencySummaryRequest) GetCompetencyidOk() (*int32, bool)`

GetCompetencyidOk returns a tuple with the Competencyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetencyid

`func (o *ToolLpDataForCompetencySummaryRequest) SetCompetencyid(v int32)`

SetCompetencyid sets Competencyid field to given value.


### GetIncludecourses

`func (o *ToolLpDataForCompetencySummaryRequest) GetIncludecourses() bool`

GetIncludecourses returns the Includecourses field if non-nil, zero value otherwise.

### GetIncludecoursesOk

`func (o *ToolLpDataForCompetencySummaryRequest) GetIncludecoursesOk() (*bool, bool)`

GetIncludecoursesOk returns a tuple with the Includecourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludecourses

`func (o *ToolLpDataForCompetencySummaryRequest) SetIncludecourses(v bool)`

SetIncludecourses sets Includecourses field to given value.

### HasIncludecourses

`func (o *ToolLpDataForCompetencySummaryRequest) HasIncludecourses() bool`

HasIncludecourses returns a boolean if a field has been set.

### GetIncluderelated

`func (o *ToolLpDataForCompetencySummaryRequest) GetIncluderelated() bool`

GetIncluderelated returns the Includerelated field if non-nil, zero value otherwise.

### GetIncluderelatedOk

`func (o *ToolLpDataForCompetencySummaryRequest) GetIncluderelatedOk() (*bool, bool)`

GetIncluderelatedOk returns a tuple with the Includerelated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncluderelated

`func (o *ToolLpDataForCompetencySummaryRequest) SetIncluderelated(v bool)`

SetIncluderelated sets Includerelated field to given value.

### HasIncluderelated

`func (o *ToolLpDataForCompetencySummaryRequest) HasIncluderelated() bool`

HasIncluderelated returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


