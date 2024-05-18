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
    /// LocalIomadLearningpathActivateRequest
    /// </summary>
    [DataContract(Name = "local_iomad_learningpath_activate_request")]
    public partial class LocalIomadLearningpathActivateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathActivateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocalIomadLearningpathActivateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocalIomadLearningpathActivateRequest" /> class.
        /// </summary>
        /// <param name="pathid">ID of Learning Path (required) (default to null).</param>
        /// <param name="state">Active (1) / deactivate (0) (required) (default to null).</param>
        public LocalIomadLearningpathActivateRequest(int pathid = null, int state = null)
        {
            this.Pathid = pathid;
            this.State = state;
        }

        /// <summary>
        /// ID of Learning Path
        /// </summary>
        /// <value>ID of Learning Path</value>
        [DataMember(Name = "pathid", IsRequired = true, EmitDefaultValue = true)]
        public int Pathid { get; set; }

        /// <summary>
        /// Active (1) / deactivate (0)
        /// </summary>
        /// <value>Active (1) / deactivate (0)</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public int State { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocalIomadLearningpathActivateRequest {\n");
            sb.Append("  Pathid: ").Append(Pathid).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
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