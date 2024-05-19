# CoreCompetencyDuplicateCompetencyFramework200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canmanage** | **bool** | canmanage | 
**Competenciescount** | **int32** | competenciescount | 
**Contextid** | **int32** | contextid | 
**Contextname** | **string** | contextname | 
**Contextnamenoprefix** | **string** | contextnamenoprefix | 
**Description** | **string** | description | [default to ""]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Id** | **int32** | id | [default to 0]
**Idnumber** | **string** | idnumber | 
**Scaleconfiguration** | **string** | scaleconfiguration | 
**Scaleid** | **int32** | scaleid | 
**Shortname** | **string** | shortname | 
**Taxonomies** | **string** | taxonomies | [default to ""]
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Usermodified** | **int32** | usermodified | [default to 0]
**Visible** | **bool** | visible | [default to 1]

## Methods

### NewCoreCompetencyDuplicateCompetencyFramework200Response

`func NewCoreCompetencyDuplicateCompetencyFramework200Response(canmanage bool, competenciescount int32, contextid int32, contextname string, contextnamenoprefix string, description string, id int32, idnumber string, scaleconfiguration string, scaleid int32, shortname string, taxonomies string, timecreated int32, timemodified int32, usermodified int32, visible bool, ) *CoreCompetencyDuplicateCompetencyFramework200Response`

NewCoreCompetencyDuplicateCompetencyFramework200Response instantiates a new CoreCompetencyDuplicateCompetencyFramework200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompetencyDuplicateCompetencyFramework200ResponseWithDefaults

`func NewCoreCompetencyDuplicateCompetencyFramework200ResponseWithDefaults() *CoreCompetencyDuplicateCompetencyFramework200Response`

NewCoreCompetencyDuplicateCompetencyFramework200ResponseWithDefaults instantiates a new CoreCompetencyDuplicateCompetencyFramework200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanmanage

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetCanmanage() bool`

GetCanmanage returns the Canmanage field if non-nil, zero value otherwise.

### GetCanmanageOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetCanmanageOk() (*bool, bool)`

GetCanmanageOk returns a tuple with the Canmanage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanmanage

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetCanmanage(v bool)`

SetCanmanage sets Canmanage field to given value.


### GetCompetenciescount

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetCompetenciescount() int32`

GetCompetenciescount returns the Competenciescount field if non-nil, zero value otherwise.

### GetCompetenciescountOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetCompetenciescountOk() (*int32, bool)`

GetCompetenciescountOk returns a tuple with the Competenciescount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetenciescount

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetCompetenciescount(v int32)`

SetCompetenciescount sets Competenciescount field to given value.


### GetContextid

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetContextname

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextname() string`

GetContextname returns the Contextname field if non-nil, zero value otherwise.

### GetContextnameOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextnameOk() (*string, bool)`

GetContextnameOk returns a tuple with the Contextname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextname

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetContextname(v string)`

SetContextname sets Contextname field to given value.


### GetContextnamenoprefix

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextnamenoprefix() string`

GetContextnamenoprefix returns the Contextnamenoprefix field if non-nil, zero value otherwise.

### GetContextnamenoprefixOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetContextnamenoprefixOk() (*string, bool)`

GetContextnamenoprefixOk returns a tuple with the Contextnamenoprefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextnamenoprefix

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetContextnamenoprefix(v string)`

SetContextnamenoprefix sets Contextnamenoprefix field to given value.


### GetDescription

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetDescriptionformat

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetId

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetIdnumber

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.


### GetScaleconfiguration

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetScaleconfiguration() string`

GetScaleconfiguration returns the Scaleconfiguration field if non-nil, zero value otherwise.

### GetScaleconfigurationOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetScaleconfigurationOk() (*string, bool)`

GetScaleconfigurationOk returns a tuple with the Scaleconfiguration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleconfiguration

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetScaleconfiguration(v string)`

SetScaleconfiguration sets Scaleconfiguration field to given value.


### GetScaleid

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.


### GetShortname

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetTaxonomies

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTaxonomies() string`

GetTaxonomies returns the Taxonomies field if non-nil, zero value otherwise.

### GetTaxonomiesOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTaxonomiesOk() (*string, bool)`

GetTaxonomiesOk returns a tuple with the Taxonomies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxonomies

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetTaxonomies(v string)`

SetTaxonomies sets Taxonomies field to given value.


### GetTimecreated

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUsermodified

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.


### GetVisible

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetVisible() bool`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) GetVisibleOk() (*bool, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCompetencyDuplicateCompetencyFramework200Response) SetVisible(v bool)`

SetVisible sets Visible field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


