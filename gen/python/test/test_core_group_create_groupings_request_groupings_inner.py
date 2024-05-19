# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_group_create_groupings_request_groupings_inner import CoreGroupCreateGroupingsRequestGroupingsInner

class TestCoreGroupCreateGroupingsRequestGroupingsInner(unittest.TestCase):
    """CoreGroupCreateGroupingsRequestGroupingsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGroupCreateGroupingsRequestGroupingsInner:
        """Test CoreGroupCreateGroupingsRequestGroupingsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGroupCreateGroupingsRequestGroupingsInner`
        """
        model = CoreGroupCreateGroupingsRequestGroupingsInner()
        if include_optional:
            return CoreGroupCreateGroupingsRequestGroupingsInner(
                courseid = 56,
                customfields = [
                    openapi_client.models.core_cohort_update_cohorts_request_cohorts_inner_customfields_inner.core_cohort_update_cohorts_request_cohorts_inner_customfields_inner(
                        shortname = '', 
                        value = '', )
                    ],
                description = 'null',
                descriptionformat = 56,
                idnumber = '',
                name = 'null'
            )
        else:
            return CoreGroupCreateGroupingsRequestGroupingsInner(
        )
        """

    def testCoreGroupCreateGroupingsRequestGroupingsInner(self):
        """Test CoreGroupCreateGroupingsRequestGroupingsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
