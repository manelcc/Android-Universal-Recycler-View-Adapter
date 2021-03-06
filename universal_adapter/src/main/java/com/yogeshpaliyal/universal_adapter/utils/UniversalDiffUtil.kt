package com.yogeshpaliyal.universal_adapter.utils

import androidx.recyclerview.widget.DiffUtil
import com.yogeshpaliyal.universal_adapter.model.BaseDiffUtil


/*
* @author Yogesh Paliyal
* techpaliyal@gmail.com
* https://techpaliyal.com
* created on 20-10-2020 21:56
*/

class UniversalDiffUtil<T>(val getSize : (Resource<List<T>?>?)->Int?, val oldList : Resource<List<T>?>?, val newList : Resource<List<T>?>?) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        LogHelper.logD("TestingCrash","areItemsTheSame Start ")
        val result = if (oldItemPosition in 0 until (oldList?.data?.size ?:0) && newItemPosition in 0 until (newList?.data?.size ?:0)){
            val oldObj = oldList?.data?.get(oldItemPosition)
            val newObj = newList?.data?.get(newItemPosition)
            if (oldObj is BaseDiffUtil){
                (oldObj as BaseDiffUtil).getDiffId() == (newObj as BaseDiffUtil).getDiffId()
            }else{
                oldObj.hashCode() == newObj.hashCode()
            }
        }else {
            false
        }

        LogHelper.logD("TestingCrash","areItemsTheSame Old Position => $oldItemPosition " +
                "&& New Position => $newItemPosition  Result => $result" +
                " Old List Size => $oldListSize  New List Size => $newListSize")


        return result
    }

    override fun getOldListSize(): Int = getSize(oldList) ?: 0

    override fun getNewListSize(): Int = getSize(newList) ?: 0

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {



        val result =  if (oldItemPosition in 0..oldListSize && newItemPosition in 0..newItemPosition) {
            val oldObj = oldList?.data?.get(oldItemPosition)
            val newObj = newList?.data?.get(newItemPosition)

            if (oldObj is BaseDiffUtil){
                (oldObj as BaseDiffUtil).getDiffBody() == (newObj as BaseDiffUtil).getDiffBody()
            }else{
                oldObj.toString() == newObj.toString()
            }
        }else{
            false
        }


        LogHelper.logD("TestingCrash","areContentsTheSame Old Position => $oldItemPosition && New Position => $newItemPosition  Result => $result")
        return result
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }

}
