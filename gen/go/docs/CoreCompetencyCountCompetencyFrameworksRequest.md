# CoreCompetencyCountCompetencyFrameworksRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**Includes** | Pointer to **string** | What other contextes to fetch the frameworks from. (children, parents, self) | [optional] [default to "children"]

## Methods

### NewCoreCompetencyCountCompetencyFrameworksRequest

`func NewCoreCompetencyCountCompetencyFrameworksRequest(context CoreCohortSearchCohortsRequestContext, ) *CoreCompetencyCountCompetencyFrameworksRequest`

NewCoreCompetencyCountCompetencyFrameworksRequest instantiates a new CoreCompetencyCountCompetencyFrameworksRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyCountCompetencyFrameworksRequestWithDefaults

`func NewCoreCompetencyCountCompetencyFrameworksRequestWithDefaults() *CoreCompetencyCountCompetencyFrameworksRequest`

NewCoreCompetencyCountCompetencyFrameworksRequestWithDefaults instantiates a new CoreCompetencyCountCompetencyFrameworksRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContext

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) GetContext() CoreCohortSearchCohortsRequestContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) GetContextOk() (*CoreCohortSearchCohortsRequestContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) SetContext(v CoreCohortSearchCohortsRequestContext)`

SetContext sets Context field to given value.


### GetIncludes

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) GetIncludes() string`

GetIncludes returns the Includes field if non-nil, zero value otherwise.

### GetIncludesOk

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) GetIncludesOk() (*string, bool)`

GetIncludesOk returns a tuple with the Includes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludes

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) SetIncludes(v string)`

SetIncludes sets Includes field to given value.

### HasIncludes

`func (o *CoreCompetencyCountCompetencyFrameworksRequest) HasIncludes() bool`

HasIncludes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


