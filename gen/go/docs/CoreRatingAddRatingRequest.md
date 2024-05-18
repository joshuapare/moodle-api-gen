# CoreRatingAddRatingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aggregation** | Pointer to **int32** | agreggation method | [optional] [default to 0]
**Component** | **string** | component | 
**Contextlevel** | **string** | context level: course, module, user, etc... | [default to "null"]
**Instanceid** | **int32** | the instance id of item associated with the context level | [default to null]
**Itemid** | **int32** | associated id | 
**Rateduserid** | **int32** | rated user id | [default to null]
**Rating** | **int32** | user rating | [default to null]
**Ratingarea** | **string** | rating area | [default to "null"]
**Scaleid** | **int32** | scale id | [default to null]

## Methods

### NewCoreRatingAddRatingRequest

`func NewCoreRatingAddRatingRequest(component string, contextlevel string, instanceid int32, itemid int32, rateduserid int32, rating int32, ratingarea string, scaleid int32, ) *CoreRatingAddRatingRequest`

NewCoreRatingAddRatingRequest instantiates a new CoreRatingAddRatingRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreRatingAddRatingRequestWithDefaults

`func NewCoreRatingAddRatingRequestWithDefaults() *CoreRatingAddRatingRequest`

NewCoreRatingAddRatingRequestWithDefaults instantiates a new CoreRatingAddRatingRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregation

`func (o *CoreRatingAddRatingRequest) GetAggregation() int32`

GetAggregation returns the Aggregation field if non-nil, zero value otherwise.

### GetAggregationOk

`func (o *CoreRatingAddRatingRequest) GetAggregationOk() (*int32, bool)`

GetAggregationOk returns a tuple with the Aggregation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregation

`func (o *CoreRatingAddRatingRequest) SetAggregation(v int32)`

SetAggregation sets Aggregation field to given value.

### HasAggregation

`func (o *CoreRatingAddRatingRequest) HasAggregation() bool`

HasAggregation returns a boolean if a field has been set.

### GetComponent

`func (o *CoreRatingAddRatingRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreRatingAddRatingRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreRatingAddRatingRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextlevel

`func (o *CoreRatingAddRatingRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreRatingAddRatingRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreRatingAddRatingRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.


### GetInstanceid

`func (o *CoreRatingAddRatingRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreRatingAddRatingRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreRatingAddRatingRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetItemid

`func (o *CoreRatingAddRatingRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreRatingAddRatingRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreRatingAddRatingRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetRateduserid

`func (o *CoreRatingAddRatingRequest) GetRateduserid() int32`

GetRateduserid returns the Rateduserid field if non-nil, zero value otherwise.

### GetRateduseridOk

`func (o *CoreRatingAddRatingRequest) GetRateduseridOk() (*int32, bool)`

GetRateduseridOk returns a tuple with the Rateduserid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateduserid

`func (o *CoreRatingAddRatingRequest) SetRateduserid(v int32)`

SetRateduserid sets Rateduserid field to given value.


### GetRating

`func (o *CoreRatingAddRatingRequest) GetRating() int32`

GetRating returns the Rating field if non-nil, zero value otherwise.

### GetRatingOk

`func (o *CoreRatingAddRatingRequest) GetRatingOk() (*int32, bool)`

GetRatingOk returns a tuple with the Rating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRating

`func (o *CoreRatingAddRatingRequest) SetRating(v int32)`

SetRating sets Rating field to given value.


### GetRatingarea

`func (o *CoreRatingAddRatingRequest) GetRatingarea() string`

GetRatingarea returns the Ratingarea field if non-nil, zero value otherwise.

### GetRatingareaOk

`func (o *CoreRatingAddRatingRequest) GetRatingareaOk() (*string, bool)`

GetRatingareaOk returns a tuple with the Ratingarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatingarea

`func (o *CoreRatingAddRatingRequest) SetRatingarea(v string)`

SetRatingarea sets Ratingarea field to given value.


### GetScaleid

`func (o *CoreRatingAddRatingRequest) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreRatingAddRatingRequest) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreRatingAddRatingRequest) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


