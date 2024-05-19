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
    /// LocalIomadLearningpathAddcoursesRequest
    /// </summary>
    [DataContract(Name = "local_iomad_learningpath_addcourses_request")]
    public partial class LocalIomadLearningpathAddcoursesRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathAddcoursesRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocalIomadLearningpathAddcoursesRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathAddcoursesRequest" /> class.
        /// </summary>
        /// <param name="courseids">courseids (required).</param>
        /// <param name="groupid">ID of group. If 0 just add to lowest numbered group (default to 0).</param>
        /// <param name="pathid">ID of Iomad Learning Path (required) (default to null).</param>
        public LocalIomadLearningpathAddcoursesRequest(List<Object> courseids = default(List<Object>), int groupid = 0, int pathid = null)
        {
            // to ensure "courseids" is required (not null)
            if (courseids == null)
            {
                throw new ArgumentNullException("courseids is a required property for LocalIomadLearningpathAddcoursesRequest and cannot be null");
            }
            this.Courseids = courseids;
            this.Pathid = pathid;
            this.Groupid = groupid;
        }

        /// <summary>
        /// Gets or Sets Courseids
        /// </summary>
        [DataMember(Name = "courseids", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Courseids { get; set; }

        /// <summary>
        /// ID of group. If 0 just add to lowest numbered group
        /// </summary>
        /// <value>ID of group. If 0 just add to lowest numbered group</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

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
            sb.Append("class LocalIomadLearningpathAddcoursesRequest {\n");
            sb.Append("  Courseids: ").Append(Courseids).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
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
