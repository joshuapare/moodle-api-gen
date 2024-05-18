# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_cohort_delete_cohort_members_request import CoreCohortDeleteCohortMembersRequest

class TestCoreCohortDeleteCohortMembersRequest(unittest.TestCase):
    """CoreCohortDeleteCohortMembersRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCohortDeleteCohortMembersRequest:
        """Test CoreCohortDeleteCohortMembersRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCohortDeleteCohortMembersRequest`
        """
        model = CoreCohortDeleteCohortMembersRequest()
        if include_optional:
            return CoreCohortDeleteCohortMembersRequest(
                members = [
                    openapi_client.models.core_cohort_delete_cohort_members_request_members_inner.core_cohort_delete_cohort_members_request_members_inner(
                        cohortid = 56, 
                        userid = 56, )
                    ]
            )
        else:
            return CoreCohortDeleteCohortMembersRequest(
                members = [
                    openapi_client.models.core_cohort_delete_cohort_members_request_members_inner.core_cohort_delete_cohort_members_request_members_inner(
                        cohortid = 56, 
                        userid = 56, )
                    ],
        )
        """

    def testCoreCohortDeleteCohortMembersRequest(self):
        """Test CoreCohortDeleteCohortMembersRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()