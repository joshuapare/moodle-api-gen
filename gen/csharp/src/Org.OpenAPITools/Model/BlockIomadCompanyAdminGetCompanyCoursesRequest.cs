/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminGetCompanyCoursesRequest
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_get_company_courses_request")]
    public partial class BlockIomadCompanyAdminGetCompanyCoursesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompanyCoursesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BlockIomadCompanyAdminGetCompanyCoursesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompanyCoursesRequest" /> class.
        /// </summary>
        /// <param name="criteria">criteria (required).</param>
        public BlockIomadCompanyAdminGetCompanyCoursesRequest(List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> criteria = default(List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner>))
        {
            // to ensure "criteria" is required (not null)
            if (criteria == null)
            {
                throw new ArgumentNullException("criteria is a required property for BlockIomadCompanyAdminGetCompanyCoursesRequest and cannot be null");
            }
            this.Criteria = criteria;
        }

        /// <summary>
        /// Gets or Sets Criteria
        /// </summary>
        [DataMember(Name = "criteria", IsRequired = true, EmitDefaultValue = true)]
        public List<BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner> Criteria { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminGetCompanyCoursesRequest {\n");
            sb.Append("  Criteria: ").Append(Criteria).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
