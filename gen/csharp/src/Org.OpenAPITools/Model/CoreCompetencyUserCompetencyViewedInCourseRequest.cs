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
    /// CoreCompetencyUserCompetencyViewedInCourseRequest
    /// </summary>
    [DataContract(Name = "core_competency_user_competency_viewed_in_course_request")]
    public partial class CoreCompetencyUserCompetencyViewedInCourseRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyUserCompetencyViewedInCourseRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyUserCompetencyViewedInCourseRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyUserCompetencyViewedInCourseRequest" /> class.
        /// </summary>
        /// <param name="competencyid">The competency id (required).</param>
        /// <param name="courseid">The course id (required).</param>
        /// <param name="userid">The user id (required).</param>
        public CoreCompetencyUserCompetencyViewedInCourseRequest(int competencyid = default(int), int courseid = default(int), int userid = default(int))
        {
            this.Competencyid = competencyid;
            this.Courseid = courseid;
            this.Userid = userid;
        }

        /// <summary>
        /// The competency id
        /// </summary>
        /// <value>The competency id</value>
        [DataMember(Name = "competencyid", IsRequired = true, EmitDefaultValue = true)]
        public int Competencyid { get; set; }

        /// <summary>
        /// The course id
        /// </summary>
        /// <value>The course id</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// The user id
        /// </summary>
        /// <value>The user id</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyUserCompetencyViewedInCourseRequest {\n");
            sb.Append("  Competencyid: ").Append(Competencyid).Append("\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
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
