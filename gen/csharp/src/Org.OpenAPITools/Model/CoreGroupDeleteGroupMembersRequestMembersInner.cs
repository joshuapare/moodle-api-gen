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
    /// CoreGroupDeleteGroupMembersRequestMembersInner
    /// </summary>
    [DataContract(Name = "core_group_delete_group_members_request_members_inner")]
    public partial class CoreGroupDeleteGroupMembersRequestMembersInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreGroupDeleteGroupMembersRequestMembersInner" /> class.
        /// </summary>
        /// <param name="groupid">group record id.</param>
        /// <param name="userid">user id.</param>
        public CoreGroupDeleteGroupMembersRequestMembersInner(int groupid = default(int), int userid = default(int))
        {
            this.Groupid = groupid;
            this.Userid = userid;
        }

        /// <summary>
        /// group record id
        /// </summary>
        /// <value>group record id</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// user id
        /// </summary>
        /// <value>user id</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreGroupDeleteGroupMembersRequestMembersInner {\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
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
