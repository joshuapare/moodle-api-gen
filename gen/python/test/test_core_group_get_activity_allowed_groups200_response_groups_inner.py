# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_group_get_activity_allowed_groups200_response_groups_inner import CoreGroupGetActivityAllowedGroups200ResponseGroupsInner

class TestCoreGroupGetActivityAllowedGroups200ResponseGroupsInner(unittest.TestCase):
    """CoreGroupGetActivityAllowedGroups200ResponseGroupsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGroupGetActivityAllowedGroups200ResponseGroupsInner:
        """Test CoreGroupGetActivityAllowedGroups200ResponseGroupsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGroupGetActivityAllowedGroups200ResponseGroupsInner`
        """
        model = CoreGroupGetActivityAllowedGroups200ResponseGroupsInner()
        if include_optional:
            return CoreGroupGetActivityAllowedGroups200ResponseGroupsInner(
                courseid = 56,
                description = '',
                descriptionformat = 56,
                id = 56,
                idnumber = '',
                name = 'null'
            )
        else:
            return CoreGroupGetActivityAllowedGroups200ResponseGroupsInner(
        )
        """

    def testCoreGroupGetActivityAllowedGroups200ResponseGroupsInner(self):
        """Test CoreGroupGetActivityAllowedGroups200ResponseGroupsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
