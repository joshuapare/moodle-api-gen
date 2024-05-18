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
    /// LocalIomadLearningpathOrdercoursesRequest
    /// </summary>
    [DataContract(Name = "local_iomad_learningpath_ordercourses_request")]
    public partial class LocalIomadLearningpathOrdercoursesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathOrdercoursesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocalIomadLearningpathOrdercoursesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathOrdercoursesRequest" /> class.
        /// </summary>
        /// <param name="courses">courses (required).</param>
        /// <param name="pathid">ID of Iomad Learning Path (required).</param>
        public LocalIomadLearningpathOrdercoursesRequest(List<LocalIomadLearningpathOrdercoursesRequestCoursesInner> courses = default(List<LocalIomadLearningpathOrdercoursesRequestCoursesInner>), int pathid = default(int))
        {
            // to ensure "courses" is required (not null)
            if (courses == null)
            {
                throw new ArgumentNullException("courses is a required property for LocalIomadLearningpathOrdercoursesRequest and cannot be null");
            }
            this.Courses = courses;
            this.Pathid = pathid;
        }

        /// <summary>
        /// Gets or Sets Courses
        /// </summary>
        [DataMember(Name = "courses", IsRequired = true, EmitDefaultValue = true)]
        public List<LocalIomadLearningpathOrdercoursesRequestCoursesInner> Courses { get; set; }

        /// <summary>
        /// ID of Iomad Learning Path
        /// </summary>
        /// <value>ID of Iomad Learning Path</value>
        [DataMember(Name = "pathid", IsRequired = true, EmitDefaultValue = true)]
        public int Pathid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocalIomadLearningpathOrdercoursesRequest {\n");
            sb.Append("  Courses: ").Append(Courses).Append("\n");
            sb.Append("  Pathid: ").Append(Pathid).Append("\n");
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
