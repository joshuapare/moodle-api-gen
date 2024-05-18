# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner(BaseModel):
    """
    ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner
    """ # noqa: E501
    aggregate: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Aggregated ratings grade.")
    aggregatelabel: Optional[StrictStr] = Field(default=None, description="The aggregation label.")
    aggregatestr: Optional[StrictStr] = Field(default=None, description="Aggregated ratings as string.")
    canrate: Optional[StrictBool] = Field(default=None, description="Whether the user can rate the item.")
    canviewaggregate: Optional[StrictBool] = Field(default=None, description="Whether the user can view the aggregated grade.")
    count: Optional[StrictInt] = Field(default=None, description="Ratings count (used when aggregating).")
    itemid: Optional[StrictInt] = Field(default=None, description="Item id.")
    rating: Optional[StrictInt] = Field(default=None, description="The rating the user gave.")
    scaleid: Optional[StrictInt] = Field(default=None, description="Scale id.")
    userid: Optional[StrictInt] = Field(default=None, description="User who rated id.")
    __properties: ClassVar[List[str]] = ["aggregate", "aggregatelabel", "aggregatestr", "canrate", "canviewaggregate", "count", "itemid", "rating", "scaleid", "userid"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "aggregate": obj.get("aggregate"),
            "aggregatelabel": obj.get("aggregatelabel"),
            "aggregatestr": obj.get("aggregatestr"),
            "canrate": obj.get("canrate"),
            "canviewaggregate": obj.get("canviewaggregate"),
            "count": obj.get("count"),
            "itemid": obj.get("itemid"),
            "rating": obj.get("rating"),
            "scaleid": obj.get("scaleid"),
            "userid": obj.get("userid")
        })
        return _obj

