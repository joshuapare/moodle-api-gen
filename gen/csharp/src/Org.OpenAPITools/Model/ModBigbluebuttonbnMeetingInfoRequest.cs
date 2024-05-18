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
    /// ModBigbluebuttonbnMeetingInfoRequest
    /// </summary>
    [DataContract(Name = "mod_bigbluebuttonbn_meeting_info_request")]
    public partial class ModBigbluebuttonbnMeetingInfoRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnMeetingInfoRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModBigbluebuttonbnMeetingInfoRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnMeetingInfoRequest" /> class.
        /// </summary>
        /// <param name="bigbluebuttonbnid">bigbluebuttonbn instance id (required).</param>
        /// <param name="groupid">bigbluebuttonbn group id (default to 0).</param>
        /// <param name="updatecache">update cache ? (default to false).</param>
        public ModBigbluebuttonbnMeetingInfoRequest(int bigbluebuttonbnid = default(int), int groupid = 0, bool updatecache = false)
        {
            this.Bigbluebuttonbnid = bigbluebuttonbnid;
            this.Groupid = groupid;
            this.Updatecache = updatecache;
        }

        /// <summary>
        /// bigbluebuttonbn instance id
        /// </summary>
        /// <value>bigbluebuttonbn instance id</value>
        [DataMember(Name = "bigbluebuttonbnid", IsRequired = true, EmitDefaultValue = true)]
        public int Bigbluebuttonbnid { get; set; }

        /// <summary>
        /// bigbluebuttonbn group id
        /// </summary>
        /// <value>bigbluebuttonbn group id</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// update cache ?
        /// </summary>
        /// <value>update cache ?</value>
        [DataMember(Name = "updatecache", EmitDefaultValue = true)]
        public bool Updatecache { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModBigbluebuttonbnMeetingInfoRequest {\n");
            sb.Append("  Bigbluebuttonbnid: ").Append(Bigbluebuttonbnid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Updatecache: ").Append(Updatecache).Append("\n");
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
