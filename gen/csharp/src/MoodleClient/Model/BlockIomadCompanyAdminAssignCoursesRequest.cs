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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminAssignCoursesRequest
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_assign_courses_request")]
    public partial class BlockIomadCompanyAdminAssignCoursesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminAssignCoursesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BlockIomadCompanyAdminAssignCoursesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminAssignCoursesRequest" /> class.
        /// </summary>
        /// <param name="courses">courses (required).</param>
        public BlockIomadCompanyAdminAssignCoursesRequest(List<BlockIomadCompanyAdminAssignCoursesRequestCoursesInner> courses = default(List<BlockIomadCompanyAdminAssignCoursesRequestCoursesInner>))
        {
            // to ensure "courses" is required (not null)
            if (courses == null)
            {
                throw new ArgumentNullException("courses is a required property for BlockIomadCompanyAdminAssignCoursesRequest and cannot be null");
            }
            this.Courses = courses;
        }

        /// <summary>
        /// Gets or Sets Courses
        /// </summary>
        [DataMember(Name = "courses", IsRequired = true, EmitDefaultValue = true)]
        public List<BlockIomadCompanyAdminAssignCoursesRequestCoursesInner> Courses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminAssignCoursesRequest {\n");
            sb.Append("  Courses: ").Append(Courses).Append("\n");
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
