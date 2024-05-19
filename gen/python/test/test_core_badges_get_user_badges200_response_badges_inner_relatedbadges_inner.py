# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_badges_get_user_badges200_response_badges_inner_relatedbadges_inner import CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner

class TestCoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner(unittest.TestCase):
    """CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner:
        """Test CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner`
        """
        model = CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner()
        if include_optional:
            return CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner(
                id = 56,
                language = '',
                name = '',
                type = 56,
                version = ''
            )
        else:
            return CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner(
        )
        """

    def testCoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner(self):
        """Test CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
