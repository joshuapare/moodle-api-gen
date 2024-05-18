# LocalIomadLearningpathGetprospectivecoursesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | Pointer to **int32** | Show only courses in this category (and children) | [optional] [default to 0]
**Filter** | Pointer to **string** | Filter course list returned | [optional] [default to ""]
**Pathid** | **int32** | ID of (target) learning path | [default to null]
**Program** | Pointer to **int32** | Show only courses assigned to this program license | [optional] [default to 0]

## Methods

### NewLocalIomadLearningpathGetprospectivecoursesRequest

`func NewLocalIomadLearningpathGetprospectivecoursesRequest(pathid int32, ) *LocalIomadLearningpathGetprospectivecoursesRequest`

NewLocalIomadLearningpathGetprospectivecoursesRequest instantiates a new LocalIomadLearningpathGetprospectivecoursesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathGetprospectivecoursesRequestWithDefaults

`func NewLocalIomadLearningpathGetprospectivecoursesRequestWithDefaults() *LocalIomadLearningpathGetprospectivecoursesRequest`

NewLocalIomadLearningpathGetprospectivecoursesRequestWithDefaults instantiates a new LocalIomadLearningpathGetprospectivecoursesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategory

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetCategory() int32`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetCategoryOk() (*int32, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) SetCategory(v int32)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetFilter

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetFilter() string`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetFilterOk() (*string, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) SetFilter(v string)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetPathid

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.


### GetProgram

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetProgram() int32`

GetProgram returns the Program field if non-nil, zero value otherwise.

### GetProgramOk

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) GetProgramOk() (*int32, bool)`

GetProgramOk returns a tuple with the Program field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgram

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) SetProgram(v int32)`

SetProgram sets Program field to given value.

### HasProgram

`func (o *LocalIomadLearningpathGetprospectivecoursesRequest) HasProgram() bool`

HasProgram returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


